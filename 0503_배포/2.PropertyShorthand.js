// Propery Shorthand (단축 속성명)
// 객체를 정의 할 때 객체의 key값과 value값이 같을경우, 각각 표기하지 않고 한번만 표기.

// ES6 이전
// const id = "ssafy",
//   name = "인영교",
//   age = 30;

// const user = {
//   id: id,
//   name: name,
//   age: age,
//   info: () => {
//     console.log(`user info: ${this.id} ${this.name} ${this.age}`);
//   },
// };

// ES6 이후

const id = "ssafy";
const name = "인영교";
const age = 27;
const user = {
  id,
  name,
  age,
};

console.log(user);
