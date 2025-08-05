# 🏏 Cricket App - React JS Assignment

This Cricket App serves as a comprehensive demonstration of ReactJS capabilities integrated with modern ES6 JavaScript features. Developed as part of the Digital Nurture 4.0 program, this application showcases practical implementation of contemporary web development practices.

## 📝 Project Overview

The cricketapp is a React-based application designed to demonstrate proficiency in modern JavaScript (ES6) features within a React framework. The application architecture incorporates multiple components that effectively utilize advanced JavaScript methods including map(), arrow functions, and destructuring techniques.

The application features a dual-view system that can be dynamically controlled through component state management.

## ✨ Technical Implementation

The application extends beyond basic requirements by implementing dynamic view switching through React hooks, providing enhanced user interaction capabilities.

### Core Features

The application architecture centers around two primary components that demonstrate various ES6 and React development patterns:

- **Dynamic View Management:** Utilizes React's useState hook to implement seamless toggling between ListofPlayers and IndianPlayers components through interactive button controls.

- **ListofPlayers Component:** Serves as the primary display component, rendering an 11-player roster with corresponding performance scores using the `.map()` iteration method. Additionally implements conditional filtering to display players with scores of 70 or below, utilizing ES6 arrow functions within the `.filter()` method for efficient data processing.

- **IndianPlayers Component:** Functions as the secondary view component, demonstrating advanced array destructuring techniques by organizing player data into "Odd" and "Even" team classifications. The component also showcases array manipulation through the merging of T20Players and RanjiTrophyPlayers datasets using the ES6 spread operator (`...`) for comprehensive data aggregation.
