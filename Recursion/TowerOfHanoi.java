/*
 * Problem: Tower of Hanoi
 * ------------------------
 * You are given three rods and N disks of different sizes.
 * Initially, all disks are stacked on the source rod (A) in 
 * increasing size (smallest on top, largest on bottom).
 * 
 * Goal:
 * Move all disks from the source rod (A) to the destination rod (C)
 * using the auxiliary rod (B) under the following rules:
 * 
 * Rules:
 * 1. Only one disk can be moved at a time.
 * 2. Only the top disk of any rod can be moved.
 * 3. No larger disk may be placed on top of a smaller disk.
 * 
 * Recursive Solution:
 * -------------------
 * To move N disks from rod A to rod C using rod Bv:
 * 1. Move N-1 disks from A to B (using C as auxiliary).
 * 2. Move the N-th (largest) disk from A to C.
 * 3. Move N-1 disks from B to C (using A as auxiliary).
 * 
 * Base Case:
 * If N == 1, directly move the disk from source to destination.
 * 
 * Time Complexity:
 * Minimum moves required = 2^N - 1
 * 
 * This problem is widely used to teach recursion and algorithm design.
 */
import java.util.*;

class TowerOfHanoi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		solve(n,'A', 'C', 'B');
	}

	private static void solve(int n, char source, char destination, char auxiliary){
		if(n == 0) return;

		solve(n-1, source, auxiliary, destination);

		System.out.printf("Move disk %d from tower%c to tower%c\n", n, source, destination);

		solve(n-1, auxiliary, destination, source);
	}
}
