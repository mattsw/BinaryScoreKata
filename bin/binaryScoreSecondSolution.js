//SRC: http://www.codewars.com/kata/binary-score/javascript
function score(n){
  return n === 0 ? 0 : Math.pow(2, Math.floor(Math.log2(n))+1)-1;
}