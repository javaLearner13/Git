<template>
  <div>
    <p>LessonFive.vue파일입니다.</p>
    <div>
        <p>프로그램 : {{web}}</p>
        <p>프로그램1 : {{web[0]}}</p>
        <p>프로그램2 : {{web[1]}}</p>
        <p>프로그램3 : {{web[2]}}</p>
        <p>프로그램4 : {{web[3]}}</p>
    </div>
  </div>
</template>

<script>
export default {
    props:{//자식 -> 부모데이터 가져올때
        web : Array,  // props : {데이터이름:자료형} String,Array,Number
    }
}
</script>

<style>

</style>