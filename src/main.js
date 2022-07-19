// window.alert(`이건 경고창 입니다`) //윈도우 안 써 있어도 실행 가능 (경고창 같은 거)

// console.log(`Hello word`); console.log(`Hello word`) //콘솔창

let integer = 10; //변수 선언
let sn = `1`
let n = 1;
let String = `김보영`;

console.log(sn==n)

console.log(String)

const name = `김보영`; //변경이 되지 않는 것

// let a = prompt("이 안에 값을 입력해주세요") // 값 받아내기
// console.log(a)

// console.log(`제가 나이는 ${integer} 제 이름은 ${String}`)

// console.log(`제가 나이는 ${prompt("나이를 입력해주세요")}${integer} 제 이름은 ${String}`)

// document.getElementById() //아이디가 있는 태그만 가져올 수 있음

const h1 = document.querySelector(`h1`) //모든 것을 종합해서 사용할 수 있게 선언 (html과의 연결 문장)
document.querySelector(`#text`)
document.querySelector(`.class`)

h1.style.backgroundColor = `red`

h1.textContent = `ㅇㅇㅇㅇㅇ`

const aaa = function name(Hello){
    console.log(Hello)
}
aaa("안녕하세요")

const bt = document.querySelector(`#but`)

const hello = function(){
    alert("안녕");
}
bt.onclick = hello; //이벤트 리스너 공부하기

let bt1=document.querySelector("#one");
let bt2=document.querySelector("#two");
let area=document.querySelector("#area");
let handClick=function (){
    alert("저를 클릭 하셨나요");
}
let a=function (){
    console.log("div 생성중");
    let newDiv=document.createElement("div")
    newDiv.style.backgroundColor="red";
    newDiv.style.width=`100px`
    newDiv.style.height=`100px`
    area.appendChild(newDiv);//이 안에다가 생성해준다 라는 뜻
}
//이벤트 달기
bt1.addEventListener(`click`,handClick);
bt2.addEventListener(`click`,a);



