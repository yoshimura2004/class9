    window.addEventListener("load", bind)
    function bind(){
    // document.querySelector("#keyword")
    // .addEventListener("focus", ()=>{
    // const keyword = document.querySelector("#keyword")
    // keyword.style.backgroundColor = "yellow";
    // })
    // document.querySelector("#keyword")
    // .addEventListener("blur", ()=>{
    // const keyword = document.querySelector("#keyword")
    // keyword.style.backgroundColor = "";
    // })
    // document.querySelector("#keyword")
    // .addEventListener("input", ()=>{
    // const keyword = document.querySelector("#keyword")
    //     const r = parseInt(Math,random()*256)
    //     const g = parseInt(Math,random()*256)
    //     const b = parseInt(Math,random()*256)
    //     const a = Math.random()
    // keyword.style.backgroundColor = `rgba(${r},${g},${b},${a})`;
    // })
    document.querySelector("#site")
    .addEventListener("change", ()=>{

    const value = document.querySelector("#site").value
    console.log("change 이벤트의 value값 ",value)
    const form = document.querySelector("#form")
    if(value == 1){
    // 여기는 네이버
    //  https://search.naver.com/search.naver
    form.setAttribute("action", "https://search.naver.com/search.naver" )
    }else if (value == 2){
    // 여기는 google
    form.setAttribute("action", "https://www.google.com/search")
    }
    })
    document.querySelector("#form")
    .addEventListener("submit", (ev)=>{
    // html 태그의 기본(고유) 기능을 막아준다.
    // 여기서는 submit 기능을 막음.
    ev.preventDefault();
    const value = document.querySelector("#keyword").value
    if(value.trim().length < 2 ){
    alert("검색어는 두 글자 이상부터야❤")
    }else{
    //submit
    document.querySelector("#form").submit();
    }
    })
    // addEventListener("copy", (ev)=> {
    //     ev.preventDefault();
    //     alert("복사는 금지야❤")
    // })
 
    //  콜백을 화살표함수로 하면 this는 여전히 window로 유지됨.
    // 이 증상을 전파라고 부른다.
    document.querySelector("#parent").addEventListener("click", function(evt){
      console.log("parent Click")

      // evt.target : 이벤트가 발생한 Dom 을 알려준다.
      console.log("evt.target : ", evt.target);

      // event.currentTarget : 이벤트가 적용된 DOM
      console.log("evt.currentTarget :", evt.currentTarget);

       // 이벤트 안에서 this 는
      // 더이상 window가 아니다.
      // js에서 this는 뭔 지 알고 있을 때만 사용해주세요.
      console.log(this)
      console.log(this === evt.currentTarget)

      // Dom.parentNode : 부모로 이동
     console.log("evt.target.parentNode :", evt.target.parentNode)
     console.log("evt.target.parentNode.parentNode :", evt.target.parentNode.parentNode)


    })
    // document.querySelector("#child1").addEventListener("click", function(evt){
      
    //   // 전파 방지
    //   // 부모로 전달되는 이벤트 중지
    //   // this를 배우기 위해 주석.
    //   // evt.stopPropagation()

    //   console.log("child1 Click")
     
    // })

    //this: 윈도우 객체를 가지고 있다.
    console.log("out:",this)
    console.log("out:",this === window)















  // 문제 1: 선택한 토핑 출력 
  // 변수선언, 요소들 배열로 묶기. 
  //  click 이벤트 

  const chkAll = document.querySelector(".chk_all");
  const chks = document.querySelectorAll(".chk");
  const btn = document.querySelector('.btn');
  const result = document.querySelector("#result");

    btn.addEventListener("click", function(){
    const select = [];
    chks.forEach((chk) => {
    if (chk.checked) {
    select.push(chk.value);
    }
    });

    if (select.length == 0) {
    result.innerHTML = "토핑 : 없음";
    } else {
    result.innerHTML = "토핑 : " + select.join(", ");
    }
    })

    // 문제 2번 전체 선택시 전체 나오게. 해제시 전체 해제.
    chkAll.addEventListener("click", function () {
    chks.forEach((chk) => {
    chk.checked = chkAll.checked;
    })
    })

//   2-2전체선택 체크 되어 있는 상태에서, 하나라도 해제 시,
//          전체 선택이 해제됨.
//          모든 요소를 각각  선택해서 직접 전체 선택을 할 경우에 
//          전체 선택이 체크 됨.
//   조건&반복문 사용  
    chks.forEach(chk => {
    chk.addEventListener("click", function () {
    let count = 0;
    for (let i = 0; i < chks.length; i++) {
      // 선택 되었을 때 
    if  (chks[i].checked) {
    count++; 
    }
    }   // 개발자는 과정이 중요하긴 하지만, 아무튼 결과만 나오면 된다.
    if (count == chks.length) {
    chkAll.checked = true;
    } else {
    chkAll.checked = false;
    }
    })
    })
    






























    
}












