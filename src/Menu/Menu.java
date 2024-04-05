package Menu;

import java.util.Scanner;

import State.State;

public class Menu {
	State state = new State();
	In in = new In();
	Out out = new Out();
	Manage manage = new Manage();
	
 	public void play(Scanner s) {
 		System.out.println("   << ���� ���� ���α׷� >>");
 		state.print_state();
 		select(state, s);
 	}
 	
 	public void select(State state, Scanner s) {
 		 int l = 1;
 		 try {
 			while(l != 4) {
 				System.out.println("=============================\n 1) ����   2) ����   3) ����   4) ����");
 				l = s.nextInt();
 				if(l==1) {
 					System.out.println("=============================\n * ������ �����ϼ̽��ϴ�. * ");
  		    	    state.print_state();
  		    	   
  		    	   in.in(state, s);
 				}
 				else if(l==2) {
 					System.out.println("=============================\n * ������ �����ϼ̽��ϴ�. * ");
 					state.print_state();
  		    	   
  		    	   out.out(state, s);
 				}
 				else if(l==3) {
 					System.out.println("=============================\n * ������ �����ϼ̽��ϴ�. * ");
 	 			    state.print_state();
 	 			    
 	 			    manage.inform(state);
 				}
 				else if(l==4) {
 					System.out.println("=============================\n * ���α׷��� �����մϴ�. * ");
 					break;
 				}
 				else {
 					System.out.println("=============================\n * 1, 2, 3, 4�� ���� �߿��� ���ÿ�. * ");
 				}
 			}
 		 }
 		 catch (Exception e) {
 			 
 		 }
 	 }
}