# ReactJS Hands-on Lab: Conditional Rendering

The "ticketbookingapp" project demonstrates conditional rendering techniques in React, developed as part of the Digital Nurture 4.0 program hands-on lab assignment.

## Assignment Objective

Learn and implement conditional rendering by creating an application that displays different content based on user authentication status.

## Implementation

The application features authentication-based conditional rendering:

**Authentication States:**
- Tracks user login status through application state
- Renders different components based on authentication status

**Conditional Content:**
- **Guest View (Logged Out):** Displays welcome message for guests, shows flight information without booking capability
- **User View (Logged In):** Shows personalized welcome message with ticket booking functionality

**Dynamic Controls:**
- Login button appears when user is logged out
- Logout button appears when user is logged in
- Button visibility controlled through conditional rendering logic

## Architecture

The application uses a component-based structure:

- **App.js:** Main component managing `isLoggedIn` state and conditional rendering logic
- **GuestPage.js:** Component rendering the logged-out user experience
- **UserPage.js:** Component rendering the logged-in user experience
- **LoginButton/LogoutButton:** Functional components defined within App.js for authentication controls

All conditional rendering is implemented using standard JavaScript conditional statements within the React component lifecycle.
