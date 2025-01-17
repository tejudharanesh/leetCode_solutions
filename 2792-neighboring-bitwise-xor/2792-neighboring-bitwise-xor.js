/**
 * @param {number[]} derived
 * @return {boolean}
 */
var doesValidArrayExist = function(derived) {
     let xr = 0;
        for (const x of derived) {
            xr ^= x;
        }
        return xr === 0;
};