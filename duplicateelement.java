import java.io.*;
public class FindDuplicates{
int FirstOccurrence(int[] array,int n){
int beg=0;
int end=array.length-1;
while(beg<=end){
int mid=beg+(end-beg)/2;
if(array[mid]==n){
if(mid-1>=0 &&array[mid-1]==n){
end=mid-1;
continue;
}
return mid;
}
else if(array[mid]<n)
    beg=mid+1;
else
    end=mid-1;
}
return -1;
}
int LastOccurrence(int[] array,int n)
{
int beg=0;
int end=array.length-1;
while(beg<=end){
int mid=beg+(end-beg)/2;
if(array[mid]==n){
if(mid+1<array.length && array[mid+1]==n){
beg=mid+1;
continue;
}
return mid;
}
else if(array[mid]<n)
beg=mid+1;
else
end=mid-1;
}
return -1;
}
public static void main(String[] args){
int[] array={1,2,3,9,9,9,10,10,12,12,13};
int first_index,last_index,n;
n=9;
FindDuplicates fd=new FindDuplicates();
first_index=fd.FirstOccurrence(array,n);
last_index=fd.LastOccurrence(array,n);
if(first_index==-1||last_index==-1){
System.out.println("Element does not exist");
}
else{
System.out.println("First Occurence of"+n+" is at index:"+first_index);
System.out.println("Last Occurence of "+n+" is at index"+last_index);
System.out.println("Total Count:"+(last_index-first_index+1));
}
fd=null;
}
}
