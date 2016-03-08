//SRC: http://www.codewars.com/kata/binary-score/javascript
function score(n){  
  var power = Math.floor(Math.log2(n));
  var result = Math.pow(2, power);
  while(power-- > 0) result += Math.pow(2, power);
  return result;
}