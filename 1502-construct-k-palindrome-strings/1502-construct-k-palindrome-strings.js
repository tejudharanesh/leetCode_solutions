/**
 * @param {string} s
 * @param {number} k
 * @return {boolean}
 */
var canConstruct = function(s, k) {
  if (k > s.length) return false;
  let count = 0;
  let map = {};
  for (let i = 0; i < s.length; i++) {
    if (map[s[i]] === undefined) {
      map[s[i]] = 1;
    } else {
      map[s[i]]++;
    }
  }
  for (let key in map) {
    if (map[key] % 2 !== 0) {
      count++;
    }
  }
  return count <= k;
};