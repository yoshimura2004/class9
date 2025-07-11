let view;

window.onload = function () {
  view = document.querySelector("#view");

  const cursor = document.querySelector("#cursor");
  cursor.style.top = "-1000px";
  cursor.style.left = "-1000px";

  bind();
};

function bind() {
  view.innerHTML = "hello <br>";

  const mouse = document.querySelector("#mouse");

  mouse.addEventListener("mousedown", function (evt) {
    view.innerHTML = "mousedown 발생<br>" + view.innerHTML;

    view.innerHTML = `
      event.offsetX : ${evt.offsetX} event.offsetY : ${evt.offsetY} <br>
      event.pageX : ${evt.pageX} event.pageY : ${evt.pageY} <br>  
      event.clientX : ${evt.clientX} event.clientY : ${evt.clientY} <br>  
      <br>
      ${view.innerHTML}
    `;
  });

  mouse.addEventListener("mouseup", function () {
    view.innerHTML = "mouseup 발생<br>" + view.innerHTML;
  });

  mouse.addEventListener("mousemove", function () {
    // 너무 번잡하므로 생략
    // view.innerHTML = "mousemove 발생<br>" + view.innerHTML
  });

  // 마우스 들어옴
  mouse.addEventListener("mouseover", function () {
    view.innerHTML = "mouseover 발생<br>" + view.innerHTML;
    mouse.style.backgroundColor = "black";
  });

  // 마우스 나감
  mouse.addEventListener("mouseout", function () {
    view.innerHTML = "mouseout 발생<br>" + view.innerHTML;
    mouse.style.backgroundColor = "white";
  });

  // 커서 따라다니는 이미지 이동
  document.querySelector("body").addEventListener("mousemove", function (evt) {
    const cursor = document.getElementById("cursor");
    cursor.style.top = evt.pageY + 1 + "px";
    cursor.style.left = evt.pageX + 1 + "px";
  });

        /*
        마우스로 클릭했을 때, 상자(div)가 잡힘.
        상자를 잡고 자유롭게 움직임 가능.
        상자에서 누르고 있던 마우스 버튼을 땔 때, 그 자리에 놓임.

        1.mousedown
        2.mousemove
        3.mouseup
        순으로 코드 작성
        */
  const drag = document.getElementById("drag");
    let offsetX = 0;
    let offsetY = 0;
    drag.addEventListener("mousedown", function (ev) {
      offsetX = ev.offsetX;
      offsetY = ev.offsetY;
      document.addEventListener("mousemove", move);
      document.addEventListener("mouseup", up);
    });

    function move(ev) {
      drag.style.left = (ev.pageX - offsetX) + "px";
      drag.style.top = (ev.pageY - offsetY) + "px";
    }

    function up() {
      document.removeEventListener("mousemove", move);
      document.removeEventListener("mouseup", up);
    }

}



