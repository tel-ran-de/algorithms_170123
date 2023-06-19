function merge(left,right) {
    var firstPointer = 0;
    var secondPointer = 0;
    var array = [];
    while (firstPointer < left.length && secondPointer < right.length) { //  пока не дошли до конца первого или второго массива
        if (left[firstPointer] > right[secondPointer]) {
            array.push(right[secondPointer]);
            secondPointer++;
        } else {
            array.push(left[firstPointer]);
            firstPointer++;
        }
    }
    while (firstPointer < left.length) {
        array.push(left[firstPointer]);
        firstPointer++;
    }
    while (secondPointer < right.length) {
        array.push(right[secondPointer]);
        secondPointer++;
    }
    return array;
}

function mergeSort(array, from, to) {
    if (to <= from) {
        return [array[from],]; // 1 elem
    }
    var middle = Math.floor((to + from) / 2); // 5
    var left = mergeSort(array, from, middle);// 5
    var right = mergeSort(array, middle + 1, to);
    return merge(left, right)
}

function test() {
    var array = [1, 5, 6, 9, 3, 2, 4, 5, 1];
    array = mergeSort(array, 0, array.length - 1);
    console.log(array);
}
