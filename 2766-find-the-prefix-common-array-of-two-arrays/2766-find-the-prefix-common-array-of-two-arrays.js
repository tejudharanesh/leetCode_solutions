/**
 * @param {number[]} A
 * @param {number[]} B
 * @return {number[]}
 */
var findThePrefixCommonArray = function(A, B) {
    let n = A.length;
    let seen = new Set();
    let ans = [];
    let common = 0;

    for (let i = 0; i < n; i++) {
        if (seen.has(A[i])) {
            common++;
        } else {
            seen.add(A[i]);
        }

        if (seen.has(B[i])) {
            common++;
        } else {
            seen.add(B[i]);
        }

        ans.push(common);
    }
    return ans;
};