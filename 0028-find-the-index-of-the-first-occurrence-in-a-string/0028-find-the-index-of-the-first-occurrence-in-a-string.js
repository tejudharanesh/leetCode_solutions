/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(a,b) {
   if (!b) return 0;
    for (let i = 0; i < a.length; i++) {
        let isMatch = true;
        for (let j = 0; j < b.length; j++) {
            if (a[i + j] !== b[j]) {
                isMatch = false;
                break;
            }
        }
        if (isMatch) return i;
    }
    return -1;
};