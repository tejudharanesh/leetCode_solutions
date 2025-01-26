/**
 * @param {number[]} favorite
 * @return {number}
 */
var maximumInvitations = function(favorite) {
    n= favorite.length;
    let inDegree = new Array(n).fill(0), pairs = [], reverseMap = {}, maxResult = 0;

    for (let i = 0; i < n; i++) {
        inDegree[favorite[i]]++;
        if (favorite[favorite[i]] === i && favorite[i] > i) {
            pairs.push([i, favorite[i]]);
        }
        if (!(favorite[i] in reverseMap)) {
            reverseMap[favorite[i]] = [];
        }
        reverseMap[favorite[i]].push(i);
    }

    let stack = [];
    for (let i = 0; i < n; i++) {
        if (inDegree[i] === 0) {
            stack.push(i);
        }
    }

    while (stack.length > 0) {
        let current = stack.pop();
        inDegree[favorite[current]]--;
        if (inDegree[favorite[current]] === 0) {
            stack.push(favorite[current]);
        }
    }

    for (let i = 0; i < n; i++) {
        if (inDegree[i] === 1) {
            let count = 1, start = i;
            while (favorite[start] !== i) {
                inDegree[start]--;
                start = favorite[start];
                count++;
            }
            maxResult = Math.max(maxResult, count);
        }
    }

    let pairSum = 0;
    for (let pair of pairs) {
        const maxChain = [1, 1];
        for (let i = 0; i < 2; i++) {
            let stack = [[pair[i], 1]];
            while (stack.length > 0) {
                let [current, length] = stack.pop();
                if (!(current in reverseMap)) {
                    maxChain[i] = Math.max(maxChain[i], length);
                    continue;
                }
                for (let neighbor of reverseMap[current]) {
                    if (neighbor === favorite[pair[i]]) continue;
                    stack.push([neighbor, length + 1]);
                }
            }
        }
        pairSum += maxChain[0] + maxChain[1];
    }

    maxResult = Math.max(maxResult,pairSum);

    return maxResult;
};