public class tim_gia_tri_nho_nhat_phuong_thuc {
    public static void main(String[] args) {
        int[] arr = {100,-10,0,101,15,25,2,4,10};
        System.out.println(minValue(arr));
    }
    public static int minValue(int[] arr){
        int result = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (result > arr[i]){
                result = arr[i];
            }
        }
        return result;
    }
}
