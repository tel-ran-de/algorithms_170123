function test() {
    getNumberCount([1, 1, 2, 2, 2, 2, 3], 2)
}

function getNumberCount(arr, x) {
    console.log(searchLeft(x, arr, 0, arr.length));
    return -1;
}

function searchLeft(number, array, from, to) {
    if (to <= from) {
        return number === array[from] ? from : -1;
    }
    let middle = (from + to) / 2;

    if (array[middle] < number) {
        return searchLeft(number, array, middle + 1, to);
    } else {
        return searchLeft(number, array, from, middle);
    }
}

function searchRight(number, array, from, to) {
    if (to <= from) {
        return from;
    }
    let middle = (from + to) / 2;

    if (array[middle] > number) {
        return searchRight(number, array, from, middle);
    } else {
        return searchRight(number, array, middle + 1, to);
    }
}
