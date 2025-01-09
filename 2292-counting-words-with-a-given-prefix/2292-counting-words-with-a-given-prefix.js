/**
 * @param {string[]} words
 * @param {string} pref
 * @return {number}
 */
var prefixCount = function(words, pref) {
   let m = pref.length;
   var count = 0;
   for (let word of words) {

  if (word.slice(0, m) === pref) {
    count++;
  }}
   return count;
};