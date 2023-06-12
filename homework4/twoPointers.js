function findK(k, array1, array2) {
    var pointer1 = 0;
    var pointer2 = 0;
    var counter = 0;
    var res = [];
    while(counter <= k) {
        if (array1[pointer1] <= array2[pointer2]) {
            res[counter] = array1[pointer1];
            pointer1++;
            counter++;
        } else {
            res[counter] = array2[pointer2];
            pointer2++;
            counter++;
        }
    }
    return res[k];
}
