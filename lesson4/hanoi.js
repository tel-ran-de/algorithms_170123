function hanoi(n, from, tmp, to) {
    if (n === 1) {
        console.log("Перемести из " + from + " в " + to);
        return;
    }
    hanoi(n - 1, from, to, tmp);
    console.log("Перемести из " + from + " в " + to);
    hanoi(n - 1, tmp, from, to);
}
