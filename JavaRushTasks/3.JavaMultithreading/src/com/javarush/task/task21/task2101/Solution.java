package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] res = new byte[ip.length];
        for(int i=0; i<ip.length;i++){
            res[i]=(byte)(ip[i] & mask[i]);
        }

        return res;
    }

    public static void print(byte[] bytes) {
        //System.out.println(Integer.parseInt(Integer.toBinaryString(bytes[0] & 0xff))+" "+
        //        Integer.parseInt(Integer.toBinaryString(bytes[1] & 0xff)) +" "+
         //       Integer.parseInt(Integer.toBinaryString(bytes[2] & 0xff))+" "+
         //       Integer.parseInt(Integer.toBinaryString(bytes[3] & 0xff)));
//
        System.out.println(String.format("%08d %08d %08d %08d",Integer.parseInt(Integer.toBinaryString(bytes[0] & 0xff)),
                Integer.parseInt(Integer.toBinaryString(bytes[1] & 0xff)),
                Integer.parseInt(Integer.toBinaryString(bytes[2] & 0xff)),
                Integer.parseInt(Integer.toBinaryString(bytes[3] & 0xff))));
    }
}