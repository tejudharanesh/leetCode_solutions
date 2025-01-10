/**
 * @param {string[]} words1
 * @param {string[]} words2
 * @return {string[]}
 */
var wordSubsets = function(words1, words2) {
  const getFrequency = (word) => {
    const freq = new Array(26).fill(0);
    for (let char of word) {
      freq[char.charCodeAt(0) - 'a'.charCodeAt(0)]++;
    }
    return freq;
  };

  const maxFreq = new Array(26).fill(0);
  for (let word of words2) {
    const freq = getFrequency(word);
    for (let i = 0; i < 26; i++) {
      maxFreq[i] = Math.max(maxFreq[i], freq[i]);
    }
  }

  const result = [];
  for (let word of words1) {
    const freq = getFrequency(word);
    let isUniversal = true;
    for (let i = 0; i < 26; i++) {
      if (freq[i] < maxFreq[i]) {
        isUniversal = false;
        break;
      }
    }
    if (isUniversal) {
      result.push(word);
    }
  }

  return result;
  }

