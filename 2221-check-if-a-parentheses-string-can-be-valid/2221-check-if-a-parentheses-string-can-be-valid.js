/**
 * @param {string} s
 * @param {string} locked
 * @return {boolean}
 */
var canBeValid = function(s, locked) {
    if (s.length % 2 !== 0) return false;

  let balance = 0;
  let unlocked = 0;

  for (let i = 0; i < s.length; i++) {
    if (locked[i] === "0") {
      unlocked++;
    } else if (s[i] === "(") {
      balance++;
    } else {
      balance--;
    }

    if (balance < 0) {
      if (unlocked > 0) {
        unlocked--;
        balance++;
      } else {
        return false;
      }
    }
  }

  balance = 0;
  unlocked = 0;

  for (let i = s.length - 1; i >= 0; i--) {
    if (locked[i] === "0") {
      unlocked++;
    } else if (s[i] === ")") {
      balance++;
    } else {
      balance--;
    }

    if (balance < 0) {
      if (unlocked > 0) {
        unlocked--;
        balance++;
      } else {
        return false;
      }
    }
  }

  return true;
};