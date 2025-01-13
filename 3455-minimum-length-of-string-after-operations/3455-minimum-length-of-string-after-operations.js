/**
 * @param {string} s
 * @return {number}
 */
var minimumLength = function(s) {
    let cnt = {};
    for (let char of s) cnt[char] = (cnt[char] || 0) + 1;
    let minus = 0;
    for (let freq of Object.values(cnt)) {
        while (freq >= 3) {
            minus += 2;
            freq -= 2;
        }
    }
    return s.length - minus;
};