# 🧵 Multithreading in Java

## 📌 What is Multithreading?
Multithreading is a process that allows the simultaneous execution of multiple threads within a single program.

- Each thread works independently.
- Multiple tasks can run at the same time.
- Improves CPU utilization and efficiency.

---

## 🚀 Key Benefits

- **High Performance**: Better use of CPU resources  
- **Time Saving**: Reduces overall execution time  
- **Better User Experience**: No waiting for tasks to finish one by one  
- **Concurrent Execution**: Multiple operations run together  

---

## 🧠 What is a Thread?

- A thread is the **smallest unit of execution** in a program  
- Also known as a **lightweight subprocess**  
- Threads execute independently  
- Failure of one thread does not affect others  

---

## ⚙️ Ways to Create Threads

- By extending the Thread class  
- By implementing the Runnable interface (preferred approach)

---

## 🔄 Multithreading vs Multitasking

| Feature | Multitasking | Multithreading |
|--------|-------------|---------------|
| Scope | Multiple programs | Single program |
| Execution | Process-based | Thread-based |
| Dependency | Tasks may wait | Independent execution |

---

## 🧵 Main Thread

- Every Java program contains a **Main Thread**  
- It executes the main method  
- Responsible for creating and starting other threads  

---

## 🔁 Thread Lifecycle

1. **New (Born)**  
   Thread is created but not started  

2. **Runnable (Ready)**  
   Thread is ready and waiting for CPU  

3. **Running**  
   Thread is currently executing  

4. **Blocked / Waiting**  
   Thread is temporarily inactive due to waiting conditions  

5. **Dead**  
   Thread has finished execution and cannot restart  

---

## 🧠 Thread Scheduler

- A component of JVM  
- Decides which thread executes next  
- Manages multiple threads on a single CPU  

### ⚠️ Important Points:
- Execution order is **not predictable**  
- Depends on system and JVM implementation  

### Common Scheduling Approaches:
- First Come First Serve (FCFS)  
- Shortest Job First (SJF)  
- Round Robin  

---

## 🔧 Important Thread Concepts

- Threads run **concurrently**, not strictly in order  
- Output may differ each time due to scheduling  
- Threads may pause or wait during execution  
- Proper handling is required for smooth execution  

---

## 🔄 Runnable Concept (Theory)

- Used when a class needs to extend another class  
- Provides flexibility in thread creation  
- Defines the task to be executed by a thread  

---

## 📌 When to Use Multithreading?

- When tasks are independent  
- To improve application performance  
- To handle multiple operations at the same time  

---

## 🎯 Interview Points

- Multithreading improves performance and responsiveness  
- Runnable is preferred over Thread class  
- Threads cannot be restarted once completed  
- Execution order is unpredictable due to scheduler  

---

## 🧾 Summary

Multithreading enables a program to execute multiple tasks simultaneously using threads. It enhances performance, reduces execution time, and improves overall user experience.
