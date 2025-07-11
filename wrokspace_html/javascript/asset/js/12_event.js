console.log("hello js");

window.addEventListener("load", init);

function init() {
  const c = document.querySelector("#console");
  console.log(c);

  const game = document.querySelector("#game")
    game.style.top = "10px";
    game.style.left = "10px";
  bind();
}

function bind() {
  const msg = document.querySelector("#console");

  const btn1 = document.querySelector("#btn1");
  btn1.onclick = function () {
    msg.innerHTML += "<br> 버튼1 클릭!";
  };

  const btn2 = document.querySelector("#btn2");
  btn2.addEventListener("click", function () {
    msg.innerHTML += "<br>버튼2 클릭";
  });
  btn2.addEventListener("click", function () {
    msg.innerHTML += "<br>버튼2 클릭~!";
  });


  const topBtn = document.querySelector("#top");
  if (topBtn) {
    topBtn.addEventListener("click", function () {
      for (let i = document.documentElement.scrollTop; i >= 0; i -= 10) {
        let time = (200 - i) * 10;
        setTimeout(function () {
          console.log("i :", i, "time:", time);
          document.documentElement.scrollTop = i;
        }, time);
      }
    });
  }

//   document.querySelector("#id").addEventListener("keydown", function (e) {
  document.querySelector("#id").addEventListener("keyup", function (event) {
      console.log(event);
    console.log(event.keyCode);
    if(event.keyCode == 13){
        console.log("엔터빵")
         document.querySelector("#pw").focus()
    }
  });

 document.querySelector("#pw")
 .addEventListener("keyup", function (event){
    if(event.keyCode ==13){
        document.querySelector("#login").click();
    }
 });
 
document.querySelector("body").addEventListener("keyup", function (event){
    console.log(event.keyCode)
    const game = document.querySelector("#game")
    console.log(game.style.top)

    // 왼쪽부터 37 38 39 40
    if(event.keyCode == 37){
     game.style.left = (parseInt(game.style.left) - 10) + "px"
    }else if(event.keyCode == 39){        
         game.style.left = (parseInt(game.style.left) + 10) + "px"
    }
   
});

}

function btnClick() {
  const msg = document.querySelector("#console");
  msg.innerHTML += "<br> btnClick 실행";
}

function btnClick2() {
  const msg2 = document.querySelector("#console2");
  const id = document.querySelector("#id").value.trim();
  const pw = document.querySelector("#pw").value.trim();

  if (id === "" && pw === "") {
    msg2.innerHTML += "<br>아이디와 비밀번호는 필수입니다.";
  } else if (id === "") {
    msg2.innerHTML += "<br>아이디는 필수입니다.";
  } else if (pw === "") {
    msg2.innerHTML += "<br>비밀번호는 필수입니다.";
  } else {
    msg2.innerHTML += `<br>아이디: ${id}, 비밀번호: ${pw}`;
  }
}

// 창 크기 변경 시
window.addEventListener("resize", function () {
  console.log("뤼뤼");
  console.log(window.innerWidth);
});

// 스크롤 시
window.addEventListener("scroll", function () {
  console.log("scroll");
  console.log("scrollTop", document.documentElement.scrollTop);
});

