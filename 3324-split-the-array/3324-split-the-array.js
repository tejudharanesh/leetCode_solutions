/**
 * @param {number[]} nums
 * @return {boolean}
 */
var isPossibleToSplit = function(nums) {
    let count = new Map();

    for(let n of nums){
        count.set(n, (count.get(n) || 0) + 1);
        if(count.get(n) > 2){
            return false;
        }
    }

    
    return true;
};