import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr) {
        if (arr.length < 2) return arr;
        // 만약 arr의 길이가 2보다 작다면 arr를 다시 반환한다.

        int mid = arr.length / 2;
        int[] low_arr = sort(Arrays.copyOfRange(arr, 0, mid));
        // Arrays.copyOfRange()는 배열을 복사한다. (원본 배열, 복사할 시작 인덱스, 복사할 끝 인덱스를 넣어준다)
        // 값에 의한 복사이므로 복사된 배열에서 값을 바꿔도 원본 배열의 값은 바뀌지 않는다.
        int[] high_arr = sort(Arrays.copyOfRange(arr, mid, arr.length));


        int[] mergedArr = new int[arr.length];
        int m = 0, l = 0, h = 0;
        while (l < low_arr.length && h < high_arr.length) {
            if(low_arr[l] < high_arr[h])
                mergedArr[m++] = low_arr[l++];
            else
                mergedArr[m++] = high_arr[h++];
        }
        while(l<low_arr.length){
            mergedArr[m++] = low_arr[l++];
        }
        while(h<high_arr.length){
            mergedArr[m++] = high_arr[h++];
        }
        return mergedArr;

    }
}

