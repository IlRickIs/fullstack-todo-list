<template>
  <div class="to-do-item" :class="{ completed: todo.completed }">
    <span>{{ todo.title }}</span>
    <div class="controls">
      <span @click="deleteItem">🗑</span>
      <span @click="completeItem">✓</span>
    </div>
  </div>
</template>

<script>

export default {
  props: {
    todo: {
      type: Object,
      default () {
        return {}
      }
    }
  },
  methods: {
    deleteItem () {
      this.$emit('delete', this.todo)
    },
    completeItem () {
      this.$set(this.todo, 'completed', !this.todo.completed)
    }
  }
}
</script>

  <style lang="scss">
  .to-do-item {
    width: 100%;
    display: block;
    height: 50px;
    &.completed {
      opacity: 0.2;
    }
    span {
      height: 50px;
      padding-left: 20px;
      line-height: 50px;
      width: 299px;
      display: inline-block;
    }
    .controls {
      display: inline-block;
      height: 50px;
      line-height: 50px;
      float: none;
      span {
        line-height: 50px;
        height: 50px;
        display: inline-block;
        width: 45px;
        text-align: center;
        padding: 0;
        cursor: pointer;
      }
    }
  }
  </style>
