package com.jhj.sortdemo;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2020/1/1.
 */
public class SortTest {
    public static void main(String[] args) {
        int[] num = suiji(6, 500);
        System.out.println(Arrays.toString(num));
        insertSort(num);
        System.out.println(Arrays.toString(num));
    }

    /**
     *
     * @param a 数组的长度
     * @param b 数组产生的数字的最大值
     * @return
     */
    public static int[] suiji(int a,int b){
        int n =5+new Random().nextInt(a);
        int[]num =new int[n];
        for (int i=0;i<num.length;i++){
            num[i]=new Random().nextInt(b);
        }
        return num;
    }

    /**
     * 冒泡排序
     * 冒泡排序思想：前后比较，大后小前，比如第一个和第二个比较，大的往后放，然后再比较第二个和第三个。。。以此类推,当一轮
     *               排完以后最后一个一定是最大的，所以第二轮比较的时候可以忽略最后一个，当第二轮排完后，倒数第二个肯定就是倒数第二大
     *               以此类推
     * 排序的轮数：n-1
     * 每一轮排序的次数：n-1-i
     *
     */
    public static void sortMaoPao(int[]num){
        for (int i=0;i<num.length-1;i++){
            for (int j=0;j<num.length-1-i;j++){
                if (num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }

    /**
     * 选择排序
     * 选择排序思想：从第一个下标的值和后面的比较，找到最小的元素和第一个交换
     *               从第二个下标的值和后面的比较，找到最小的元素放在第二个
     *               以此类推
     */
    public static void selectSort(int[]num){
        for (int i=0;i<num.length-1;i++){
            for (int j=i+1;j<num.length;j++){
                if (num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
    }

    /**
     * 快速排序
     * 快速排序是一种排序执行效率很高的排序算法，它利用分治法来对待排序序列进行分治排序，
     * 它的思想主要是通过一趟排序将待排记录分隔成独立的两部分，其中的一部分比关键字小，后面一部分比关键字大，
     * 然后再对这前后的两部分分别采用这种方式进行排序，通过递归的运算最终达到整个序列有序
     */
    public static void quickSort(int[]num,int low,int high){
        int i,j,temp,t;
        if (low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp=num[low];
        while (i<j){
            //先看右边，一次往左递减
            while (temp<=num[j]&&i<j){
                j--;
            }
            //再看左边，依次往右递减
            while (temp>=num[i]&&i<j){
                i++;
            }
            //如果满足条件
            if (i<j){
                t=num[j];
                num[j]=num[i];
                num[i]=t;
            }
        }
        //最后将基准位于i和j相等位置的数字交换
        num[low]=num[i];
        num[i]=temp;
        //递归调用左半数组
        quickSort(num,low,j-1);
        quickSort(num,j+1,high);
    }

    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[]arr){
       for (int i=1;i<arr.length;i++){
           int temp =arr[i];//保存每次需要插入的那个数
           int j;
           for (j=i;j>0&&arr[j-1]>temp;j--){
               arr[j] =arr[j-1]; //吧大于需要插入的数往后移动。最后不大于temp的数就空出来j
           }
           arr[j] =temp;
       }
    }
}
