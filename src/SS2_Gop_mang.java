import java.util.Scanner;
public class SS2_Gop_mang {
    public static int[] NhapMang(){
        int n=0;
        Scanner sr=new Scanner(System.in);
        System.out.print("Nhập số phần tử n: ");
        n=sr.nextInt();
        int []arr=new int[n];
        System.out.println("\n Nhập giá trị từng phần tử của mảng: \n");
        for (int i=0;i<arr.length;i++){
            System.out.print("a["+i+"]=");
            arr[i]=sr.nextInt();
        }
        return arr;
    }
    public static void Xuatmang(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] GopMang(int arr[],int arr1[]){
        int[] newArr=new int[arr.length+arr1.length];
        int i=0,j=0;
        for (int k=0;k<newArr.length;k++) {
            if (i < arr.length && j < arr1.length) {
                if (arr[i] <= arr1[j]) {
                    newArr[k] = arr[i];
                    i++;
                } else {
                    newArr[k] = arr1[j];
                    j++;
                }
            }else {
                if (i<arr.length){
                    newArr[k]=arr[i];
                    i++;
                }else {
                    if (j<arr1.length){
                        newArr[k]=arr1[j];
                        j++;
                    }
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        System.out.println("Nhập mảng A: ");
        int []arr=NhapMang();
        System.out.print("Mảng A là: ");
        Xuatmang(arr);
        System.out.println();
        System.out.println("Nhập mảng B: ");
        int []arr1=NhapMang();
        System.out.print("Mảng B là: ");
        Xuatmang(arr1);
        System.out.println();
        System.out.print("Gộp 2 mảng là: ");
        int [] newArray=GopMang(arr,arr1);
        Xuatmang(newArray);


    }
}
