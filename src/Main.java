public class Main {
    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3,6,9};
        int [] arr2 = {4, 7, 12};
        int m =arr1.length;
        int n =arr2.length;
        int [] arrEnd = new int [m+n];


        if (arr1[m-1] <= arr2[0]){
            for (int l =0; l < n+m ;  l++){
                if(l < m){
                    arrEnd[l]=arr1[l];
                }else{
                    arrEnd[l]=arr2[l-m];
                }
                System.out.println(arrEnd[l]);
            }

        }else if (arr2[n-1] <= arr1[0]){
            for (int i =0; i < n+m ;  i++){
                if(i < n){
                    arrEnd[i]=arr2[i];
                }else{
                    arrEnd[i] = arr1[i-n];
                }
                System.out.println(arrEnd[i]);
            }
        }else {
            int i = 0;
            int j = 0;
            int k = 0;


            while (i < m && j < n) {


                if (arr1[i] < arr2[j]) {
                    arrEnd[k] = arr1[i];
                    i++;
                } else {
                    arrEnd[k] = arr2[j];
                    j++;
                }
                k++;
            }
            while (i < m) {

                arrEnd[k] = arr1[i];
                i++;
                k++;

            }
            while (j < n) {
                arrEnd[k] = arr2[j];
                j++;
                k++;
            }
            for (int l = 0; l < (m + n); l++) {
                System.out.println(arrEnd[l]);
            }

        }

    }

}



