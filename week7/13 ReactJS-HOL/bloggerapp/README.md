# Blogger App - React Conditional Rendering Laboratory

## Project Description

The Blogger App represents a React-based application developed during the Digital Nurture 4.0 program. This project focuses on implementing conditional rendering techniques to display three distinct content types: Course Details, Book Details, and Blog Details. Users can interact with navigation buttons to selectively render components.

## Technical Learning Outcomes

This laboratory exercise provided comprehensive exposure to fundamental React concepts:

* **Component Architecture:** Implemented modular design patterns by creating separate components (`CourseDetails`, `BookDetails`, `BlogDetails`) to maintain code organization and reusability.

* **Props-based Data Flow:** Established unidirectional data flow by passing information from the parent component (`App.js`) to child components, centralizing data management within the main application component.

* **Array Rendering with `.map()`:** Utilized the `.map()` method for dynamic list generation, implementing proper `key` attributes to optimize React's reconciliation process.

* **Conditional Rendering Implementation:** Applied multiple conditional rendering strategies:
    1. **State Management with Switch Logic:** Employed `useState` hook combined with `switch` statements to manage view states (`'all'`, `'books'`, etc.) and return appropriate components based on current selection.
    2. **Logical AND Operator:** Implemented short-circuit evaluation using `&&` operator for simple conditional displays (`show === 'all' && <h1>...</h1>`).
    3. **Ternary Conditional Operator:** Applied ternary expressions (`condition ? if_true : if_false`) for dynamic footer content based on component visibility state.

* **CSS Layout with Flexbox:** Configured responsive three-column layout using CSS Flexbox properties, incorporating visual separators to match design specifications.
