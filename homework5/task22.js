function test()
{
    let array = [
    [10, 20, 15],
    [21, 30, 14],
    [7, 16, 32],];
    console.log(findPeak2D(array, 0, array[0].length));

}

function findPeak2D(array, from, to) {
    let median = Math.floor((from + to) / 2);
    var maxIndex = findMaxIndex(array, median);
    let val = array[maxIndex][median];
    if (median === 0 || median === array[maxIndex].length -1) {
        return val;
    }
    if (val >= array[maxIndex][median - 1] && val >= array[maxIndex][median + 1]) {
        return val;
    }
    if (val < array[maxIndex][median + 1]) {
        return findPeak2D(array, median + 1, to);
    } else {
        return findPeak2D(array, from, median - 1);
    }
}

function findMaxIndex(array, column) {
    var max = -1;
    var maxIndex = -1;
    for (let i = 0; i < array[0].length; i++) {
        if (array[i][column] > max) {
            max = array[i][column];
            maxIndex = i;
        }
    }
    return maxIndex;
}
