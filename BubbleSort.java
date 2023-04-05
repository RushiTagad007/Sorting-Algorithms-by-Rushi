public class BubbleSort{

public static void main(String[] args){

int[] arr ={0,1,2,3,4,5,6,7,8,9,};
int temp;

int comparision=0;

int Swap=0;



for(int i=0; i<arr.length-1;i++){

 System.out.println("--------------------------------------");
      System.out.println("Round :"+(i+1));
   System.out.println("--------------------------------------");

boolean status=false;
   for(int j=0; j<arr.length-i-1;j++){
            
comparision++;

  System.out.println("Comparision :"+comparision);

        if(arr[j]>arr[j+1]){
        
  Swap++;
 System.out.println("Swap is :"+Swap);

     System.out.println("Swapping  :  "+arr[j] +"  AND  "+arr[j+1]);
      temp=arr[j];
      arr[j]=arr[j+1];
     arr[j+1] =temp;
     status=true;

}

if(status == false){
break;
}


}
}
   
   System.out.println("--------------------------------------");

System.out.println("Swapped array is");


for(int x=0; x<arr.length;x++){

System.out.print("  "+arr[x]);

}


if((arr.length-1)==comparision){
System.out.println(" It was Sorted Array");
}



if(((arr.length-1)*(arr.length)/2)==comparision)
System.out.println("\n  It was UnSorted Array");

}

}

