// ConciseMethod (간결한 메소드)

// 함수 선언 형식
// function a() { } // 명명(익명) 함수 선언
// const a = function () { } // 명명 함수 표현
// const a = new Function('x', 'y', 'return x + y') // 함수 생성자

// ES6 이전
// const id = "ssafy",
//   name = "인영교",
//   age = 27;

// const user = {
//   id,
//   name,
//   age,
//   info: function () {
//     console.log("user info: " + this.id + " " + this.name + " " + this.age);
//   },
// };
// user.info();

// ES6 이후

const id = "ssafy",
  name = "인영교",
  age = 30;

const user = {
  id,
  name,
  age,
  info() {
    console.log("user info : " + this.id + " " + this.name + " " + this.age);
  },
};

user.info();
