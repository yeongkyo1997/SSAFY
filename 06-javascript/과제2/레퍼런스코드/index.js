// 편의성을 위해 객체 배열 선언
let foods = [
  { ename: "cake", kname: "케이크" },
  { ename: "burger", kname: "햄버거" },
  { ename: "steak", kname: "스테이크" },
  { ename: "sandwich", kname: "샌드위치" },
];
// foods 배열의 크기만큼 자동 반복돌면서 각 요소들을 반환
let html = "";
foods.forEach((food, index) => {
  html += `<img src="./images/${food.ename}.jpg" data-index="${index}">`;
});
document.querySelector(".img-thumb").innerHTML = html;

// 처음 로딩시 케이크 이미지 적용
choiceImg(0);

// 랜덤 선택 버튼 클릭 시 이벤트 처리
document.getElementById("randomBtn").onclick = () =>
  choiceImg(parseInt(Math.random() * 4));

// 하단 썸네일 이미지 클릭 시 이벤트 처리
document.querySelectorAll(".img-thumb > img").forEach((img) => {
  img.onclick = () => {
    choiceImg(parseInt(img.getAttribute("data-index")));
  };
});

// 인덱스 위치의 이미지를 선택 모양을 만들고 화면 중앙 이미지로 설정
function choiceImg(index) {
  document
    .querySelector(".img-view > img")
    .setAttribute("src", `./images/${foods[index].ename}.jpg`);

  document.getElementById("foodName").innerText = foods[index].kname;
  document
    .querySelectorAll(".img-thumb > img")
    .forEach((img) => img.classList.remove("choice"));
  document
    .querySelector(`.img-thumb > img:nth-child(${index + 1})`)
    .classList.add("choice");
}
