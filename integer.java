int length = 1;
if (number >= 100000000) {
    length += 8;
    number /= 100000000;
}
if (number >= 10000) {
    length += 4;
    number /= 10000;
}
if (number >= 100) {
    length += 2;
    number /= 100;
}
if (number >= 10) {
    length += 1;
}
return length;
