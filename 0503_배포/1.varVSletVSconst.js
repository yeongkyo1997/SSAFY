// var a = 10;
// console.log(a);

// var a = 20;
// console.log(a);

// // const c = 10;
// // c = 20;
// // console.log(c);

// const ssafy = {
//   area: "대전",
//   class: 6,
// };

// const num = [];
// console.log(num);
// num.push(num);

// let i = 10;
// for (i = 0; i < 5; i++) {
//   console.log(i);
// }
// console.log(i);

// var VS let Scope Test
function scope1() {
  var x = 11;
  if (true) {
    var x = 99;
    console.log(x); // 결과   99
  }
  console.log(x); // 결과   99
}
// scope1();

function scope2() {
  let x = 11;
  if (true) {
    let x = 99;
    console.log(x); // 결과   99
  }
  console.log(x); // 결과   11
}
// scope2();

function scope3() {
  if (true) {
    var x = 99;
    console.log(x); // 결과   99
  }
  console.log(x); // 결과   99
}
// scope3();

function scope4() {
  let x = 99;
  if (true) {
    console.log(x); // 결과   99
  }
  console.log(x); // 결과   99
}
// scope4();

function scope5() {
  if (true) {
    let x = 99;
    console.log(x); // 결과   99
  }
  console.log(x);
}
// scope5();
