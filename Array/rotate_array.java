// /////////////////////////////////Approach 1///////////////////////////////////////////////////////
int n=d%arr.length;
        int[]temp=new int[arr.length];
        int j=0;
        for(int i=n;i<arr.length;i++){
            temp[j]=arr[i];
            j++;
        }
        int i=0;
        while(i<n){
            temp[j]=arr[i];
            j++;
            i++;
        }
        int k=0;
        while(k<arr.length){
            arr[k]=temp[k];
            k++;
        }


// //////////////////////////////////////////////////Approach 2/////////////////////////////////////////////////////////

int n=d%arr.length;
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=n;
        j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
