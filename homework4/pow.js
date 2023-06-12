function powEffective(x,n) {
    if (n === 1) {
        return x;// x * 1
    }
    if (n % 2 === 0) {
        let tmp = powEffective(x, n / 2);// divide and conc
        return tmp * tmp;//merge
    } else {// n == 5
        let tmp = powEffective(x, (n - 1) / 2);
        return x * tmp * tmp;
    }
}
