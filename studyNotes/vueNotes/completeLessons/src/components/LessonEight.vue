<template>
  <div>
    <p><button id="ex1">클릭</button> : <span> 여기에 출력</span></p>
    <p><button id="ex2">클릭</button></p>
    <div class="test">테스트</div>
    <hr>
    <div id="touchSlider11">
      <ul>
        <li>content 1</li>
        <li>content 2</li>
        <li>content 3</li>
        <li>content 4</li>
      </ul>
    </div>   
  </div>
</template>

<script>
import $ from 'jquery'
import touchSlider from 'jquery.touchslider'  // eslint-disable-line no-unused-vars
//javascript에서 문법오류 또는 사용하지않는 변수,함수및 함수 매개변수를 제거하는 검사기
export default {
  mounted() {//인스턴스에 부착되고 호출되는 상태/ 컴포넌트,탬플릿,렌더링된 돔에 접근가능
    $('#ex1').on('click', () =>{
      alert('안녕하세요!!')
      $('#ex1').next('span').text('인사')
    })
    $('#ex2').on('click', () => {
      $('.test').css({ color : 'red', backgroundColor : 'yellow', width : '100px', height : '100px'})
    })
    $('#touchSlider11').touchSlider({ // eslint-disable-line no-unused-vars
      speed:1000,
      autoplay: {
        enable: true,
        pauseHover: true,
        addHoverTarget: '', // 다른 오버영역 추가 ex) '.someBtn, .someContainer'
        interval: 3500
      }
    })   
  },
}
</script>

<style>
.ts-controls { height: 36px; position: relative; overflow: hidden; }
.ts-prev {display: none;}
.ts-next {display: none;}

.ts-paging { width:100%; text-align:center; position:absolute; top:12px; left:0; }
.ts-paging-btn { display:inline-block;width:15px; height:15px; margin-left:7px; border:1px solid #333333; border-radius: 50%; background-color: #3399cc; overflow: hidden; font-size: 0;}
.ts-paging-btn:first-child { margin-left: 0; }
.ts-paging-active { background:#ff0000; }

#touchSlider11 {width:95%; height:280px; margin:0 auto;position:relative; overflow:hidden; }
#touchSlider11 ul { position:absolute; top:0; left:0; overflow:hidden; }
#touchSlider11 ul li{width:100%;height:250px; font-size:14px; color:#333333; list-style:none; }
#touchSlider11 ul li:nth-child(1){background-color: yellow;}
#touchSlider11 ul li:nth-child(2){background-color: pink;}
#touchSlider11 ul li:nth-child(3){background-color: orange;}
#touchSlider11 ul li:nth-child(4){background-color:yellowgreen;}
</style>