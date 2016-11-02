package com.bitsetapp;

import java.util.BitSet;

public class BitSetApp {

	public static void sortArray() {
		int[] array = new int[] { 423, 700, 9999, 2323, 356, 6400, 1,2,3,2,2,2,2 };
		BitSet bitSet = new BitSet(2 << 13);
		// ��Ȼ�����Զ����ݣ��������ڹ���ʱָ�������С,Ĭ��Ϊ64
		System.out.println("BitSet size: " + bitSet.size());

		for (int i = 0; i < array.length; i++) {
			bitSet.set(array[i]);
		}
		//�޳��ظ����ֺ��Ԫ�ظ���
		int bitLen=bitSet.cardinality();	

		//�������򣬼���bitΪtrue��Ԫ�ظ��Ƶ���һ������
		int[] orderedArray = new int[bitLen];
		int k = 0;
		for (int i = bitSet.nextSetBit(0); i >= 0; i = bitSet.nextSetBit(i + 1)) {
			orderedArray[k++] = i;
		}

		System.out.println("After ordering: ");
		for (int i = 0; i < bitLen; i++) {
			System.out.print(orderedArray[i] + "\t");
		}
		
		System.out.println("iterate over the true bits in a BitSet");
		//��ֱ�ӵ���BitSet��bitΪtrue��Ԫ��iterate over the true bits in a BitSet
		for (int i = bitSet.nextSetBit(0); i >= 0; i = bitSet.nextSetBit(i + 1)) {
			System.out.print(i+"\t");
		}
		System.out.println("---------------------------");
	}
	
	
	
	
	public static void main(String[] args) {

		BitSet bs =new BitSet();
		
		bs.set(0);
		
		bs.set(0);
		
		bs.set(4);
		
		System.out.println( bs.cardinality());
		
		System.out.println(bs.size());
		
		System.out.println(bs.length());
		
	}

}
