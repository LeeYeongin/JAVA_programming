package com.ruby.java.ch10;
//구현과제로 실습
//hashset을 arraylist로 변환하여 정렬하기 구현

/*
 * 로또 당첨 규칙:
 * 꽝: 번호 2개, 1개
 * 5등: 번호 3개 - 5000원
 * 4등: 번호 4개 - 5만원
 * 3등: 번호 5개 - 150만원 - 판매금액에 변동(판매금액의 12.5%)
 * 2등: 3등번호 + 보너스번호 - 3000만원 - 판매 금액에 변동, 당첨 확률: 1,300,000분의1
 * 1등: 6개 숫자 - 당첨 확률 8,000,000 분의 1, 10억 ~ 30억
 */
//hashset(중복이 없음)을 arraylist로 변환하여 정렬하기 구현 -> collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test_ch10_lotto {

	public static void main(String[] args) {

		lotto_generator(10); // 로또 번호 생성기

	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		List<HashSet<Integer>> lotSet = new ArrayList<>(); // 복권 여러장
		HashSet<Integer> lotto = null; // 복권 한장
		/*
		 * 랜덤한 숫자 6개 + 보너스 번호(중복 X)
		 * [[35, 40, 27, 29, 14, 31, 15], [0, 1, 18, 38, 6, 24, 29],
		 *  [16, 32, 0, 18, 34, 22, 14], [32, 34, 40, 9, 12, 28, 14],
		 *  [0, 19, 6, 9, 42, 29, 13], [2, 3, 37, 43, 44, 29, 14],
		 *  [33, 1, 17, 22, 6, 8, 12], [34, 21, 9, 10, 27, 44, 45], [18, 34, 23, 9, 28, 29, 15],
		 *  [32, 6, 23, 24, 10, 27, 43]]
		 */
		for (int i = 0; i < n; i++) {
			lotto = new HashSet<>();
			//구현할 부분
			for (int j=0; lotto.size()<6; j++) {
				lotto.add(number.nextInt(45) + 1);
			}
			
			lotSet.add(lotto); // 복권 명부에 발행 복권을 추가
		}
		
		System.out.println("\nlot hashset을 출력\n");
		
		for (HashSet<Integer> eachLotto : lotSet) {
			/*
			 * 아래 모양으로 출력
			 * [33  1 17 22  6  8]
			 *  [0  1 18 38  6 24]
			 */
			// 구현
			List<Integer> lot = new ArrayList<Integer>(eachLotto);
			Collections.sort(lot); // HashSet을 List로 바꿔 정렬
			System.out.println(lot);
			
//			System.out.println(eachLotto); // 정렬하지 않고 그냥 출력할 경우 그냥 이 코드 사용
		}

		//당첨번호 추첨
		HashSet<Integer> win = new HashSet<>();
		
		for (int j = 0; win.size() < 6; j++) {//6개 번호와 보너스 번호
			win.add(number.nextInt(45)+1);
		}
		
		// 보너스 번호
		int bonus = number.nextInt(45) + 1;
		System.out.print("당첨번호: " + win + " 보너스 번호: " + bonus);//6개의 당첨번호와 보너스번호 출력
		
		// 6개를 맞힌 복권을 찾는다 
		System.out.println();
		winnerLotto(win, bonus, lotSet);//1등을 찾는다
	}
	
	static void winnerLotto(HashSet<Integer> w, int bonus, List<HashSet<Integer>> lotSet) {
		// 당첨번호 w에 대하여 발행된 복권 리스트 lotSet의 모든 원소 elem에 대하여 조사한다
		for (int i = 0; i < lotSet.size(); i++) {
			//구현할 부분
			// lotto hashset을 하나식 꺼내 checkWinner
			checkWinner(w, bonus, lotSet.get(i));
		}
	}
	
	static void checkWinner(HashSet<Integer> w, int bonus, HashSet<Integer> elem) {
		// 당첨번호 w의 각 숫자를 꺼내 복권 엔트리에 포함되어 있는지를 조사
		List<Integer> L = new ArrayList<>(w);
		Collections.sort(L);
		int count = 0; // 몇개를 맞췄는가
		for (int i = 0; i < L.size(); i++)
		{
			/*
			 * 당첨번호 각 번호를 몇개 포함하는지를 elem에 대하여 조사
			 */
			//구현할 부분
			if(elem.contains(L.get(i)))
				count++;
		}

		/*
		 * 코드2: removeAll함수를 사용하여 당첨번호 포함 갯수를 계산하는 코드 
		 * 	List<Integer> el = new ArrayList<Integer>(elem);
		 *  el.removeAll(L); 
		 *  count = 6 - el.size();
		 */
		
		switch (count) {
			case 0:
			case 1:
			case 2:
				System.out.println("꽝");
				break;
			case 3:
				System.out.println("5등 복권 " + elem + " 당첨번호:" + w);
				break;
			case 4:
				System.out.println("4등 복권 " + elem + " 당첨번호:" + w);
				break;
			case 5:
				// 수정 필요 (2,3 등)				
				if (elem.contains(bonus)) { //보너스 번호가 일치하는 지를 조사 
					System.out.println("2등 복권 " + elem + " 당첨번호:" + w); 
					break; 
				}
				else { 
					System.out.println("3등 복권 " + elem + " 당첨번호:"+ w); 
					break; 
				}
				/*
				 * 코드2 버전 
				 * 위 132~139줄의 elem.contains(bonus)를 el.contains(bonus)로 수정
				 */
			case 6:
				System.out.println("1등 복권 " + elem + " 당첨번호:" + w);
				break;
		}


	}
}