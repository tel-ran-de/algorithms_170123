function test(){
    let arr = [10, 20, 15, 2, 23, 90, 67]; // O(n)
    let peak = findPeak(arr, 0, arr.length);
    console.log(peak)
}

function findPeak(array, from, to) {
    let median = Math.floor((from + to) / 2);
    let val = array[median];
    if (median === 0 || median === array.length -1) {
        return val;
    }
    if (val >= array[median - 1] && val >= array[median + 1]) {
        return val;
    }
    if (val < array[median + 1]) {
        return findPeak(array, median + 1, to);
    } else {
        return findPeak(array, from, median - 1);
    }
}
