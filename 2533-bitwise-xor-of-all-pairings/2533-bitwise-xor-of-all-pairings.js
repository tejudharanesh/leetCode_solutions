/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var xorAllNums = function(nums1, nums2) {
    let m = nums1.length;
    let n = nums2.length;
    let x1 = 0, x2 = 0;

    if (m % 2 !== 0) {
        for (let num of nums2) {
            x2 ^= num;
        }
    }
    if (n % 2 !== 0) {
        for (let num of nums1) {
            x1 ^= num;
        }
    }
    return x1 ^ x2;
};