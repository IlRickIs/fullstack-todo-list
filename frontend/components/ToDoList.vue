<template>
  <div class="to-do-container">
    <div class="create-container">
      <input v-model="titleOfNewToDo" type="text">
      <button @click="$emit('create')">
        Add
      </button>
    </div>
    <div class="to-do-list-container">
      <to-do-list-item v-for="todo in todos" :key="todo.id" :todo="todo" @delete="deleteItem" />
    </div>
  </div>
</template>

<script setup>
import ToDoListItem from '~/components/ToDoListItem.vue'
</script>

<script>

export default {

  props: {
    todos: {
      type: Array,
      default () {
        return []
      }
    }

  },
  data () {
    return {
      titleOfNewToDo: ''
    }
  },
  methods: {

  }
}

</script>

  <style lang="scss">
  .to-do-container {
    width: 400px;
    margin: auto;
    margin-top: 50px;
    display: block;

    .create-container {
      width: 100%;
      height: 50px;
      box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);

      input {
        height: 50px;
        width: 300px;
        border: none;
        padding-left: 10px;
        font-family: "Quicksand", "Source Sans Pro", -apple-system,
          BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial,
          sans-serif;
        font-size: 18px;
        &:focus {
          outline: none;
        }
      }

      button {
        height: 45px;
        float: right;
        background: none;
        width: auto;
        margin: 0;
        border: none;
        cursor: pointer;
        text-align: right;
        padding-right: 20px;
        font-size: 18px;
        &:focus {
          outline: none;
        }
      }
    }
  }
  .to-do-list-container {
    width: 400px;
    margin: auto;
    margin-top: 50px;
    display: block;
    box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);
  }
  </style>
