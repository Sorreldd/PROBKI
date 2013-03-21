package ru.probki;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double u, v, W;
		int U, V, n = sc.nextInt(), m = sc.nextInt();
		Point[] p = new Point[n];
		Edge[] e = new Edge[m];
		for(int i = 0; i < n; i++) {
			u = sc.nextDouble();
			v = sc.nextDouble();
			p[i] = new Point(u, v);
		}
		for(int i = 0; i < m; i++) {
			U = sc.nextInt();
			V = sc.nextInt();
			W = sc.nextDouble();
			e[i] = new Edge(U, V, W);
		}
		City StP = new City(n, p, e);
		
		System.out.println();
		StP.outInfo();
		sc.close();
	}
}
