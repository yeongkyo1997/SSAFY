// SpreadSyntax (전개구문)
// spread operator는 반복 가능한(iterable) 객체에 적용할 수 있는 문법.
// 배열이나 문자열 등을 풀어서 요소 하나 하나로 전개시킬 수 있다.
const user1 = { id: "ssafy1" };
const user2 = { id: "ssafy2" };
const arr = [user1, user2];
console.log(arr);

const copyArr = [...arr];
console.log(copyArr);
