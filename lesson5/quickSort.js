function test(){
    var array = [1, 5, 6, 9, 3, 2, 4, 5, 1, 6];
    quickSort(array, 0, array.length - 1);
    console.log(array);
}

function quickSort(array, from, to) {
    if (from < to) {
        var partitionIndex = partition(array, from, to);// left- меньше пайвота right - больше пайвота
        quickSort(array, from, partitionIndex);
        quickSort(array, partitionIndex + 1, to);
    }
}

function partition(array, from, to) {
    let medianIndex = (to + from) / 2;
    let pivot = array[medianIndex];
    var leftPointer = from;
    var rightPointer = to;
    while (leftPointer <= rightPointer) {
        while (array[leftPointer] < pivot) {
            leftPointer++;
        }
        while (array[rightPointer] > pivot) {
            rightPointer--;
        }
        if (leftPointer >= rightPointer) {
            break;
        }
        swap(array, leftPointer, rightPointer);
        leftPointer++;
        rightPointer--;
    }
    return rightPointer;
}

function swap(array, leftPointer, rightPointer) {
    let tmp = array[leftPointer];
    array[leftPointer] = array[rightPointer];
    array[rightPointer] = tmp;
}


// function partition(array, l, r) {
//     let pivot = //выбираем опорный
//     var m = l
//     for (let i = l; i < r; i++) {
//         if (array[i] < pivot) {
//             swap(array[i], array[m])
//         }
//         m++
//     }
//     return m
// }

