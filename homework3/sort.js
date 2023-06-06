function sortIntersection(array) {
    for (i = 2; i < array.length; i++) {  // O(n -2) -> O(n)
        x = array[i];
        j = i;
        while (j > 1 && array[j - 1] > x) {// O(n)
            array[j] = array[j - 1];
            j--;
        }
        array[j] = x;
    }
    return array;// O(n)*O(n) = O(n^2)
}
