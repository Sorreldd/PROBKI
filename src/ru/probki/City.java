package ru.probki;

import java.util.ArrayList;

public class City {
	Point[] vertex;
	Edge[] edges;
	int n;
	ArrayList <Edge> g[];
	public City(int n, Point[] vertex, Edge[] edges) {
		this.n = n;
		this.vertex = vertex;
		this.edges = edges;
		g = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			g[i] = new ArrayList<Edge>();
		}
		for(int i = 0; i < edges.length; i++) {
			g[edges[i].u].add(new Edge(edges[i].v, 0, edges[i].dst));
			g[edges[i].v].add(new Edge(edges[i].u, 0, edges[i].dst));
		}
	}
	public void outInfo() {
		for(int i = 0; i < n; i++) {
			System.out.print(i + ": ");
			for(int j = 0; j < g[i].size(); j++) {
				System.out.print(g[i].get(j).u);
				System.out.print(" ");
				System.out.print(g[i].get(j).dst);
			}
			System.out.println();
		}
	}
	
}
